/**
 * Ice Demon Task - Handles the Ice Demon boss room in Chambers of Xeric
 *
 * Boss Mechanics:
 * - Ice Demon is immune to damage unless braziers are lit with kindling
 * - Demon shoots ice barrage projectiles that must be dodged
 * - Kindling must be collected from kindling piles around the room
 * - Braziers must be fed with kindling to keep them burning
 * - As the demon takes damage, more kindling is required
 * - Protect from Missiles prayer reduces damage from ice attacks
 *
 * Strategy:
 * - Collect kindling from kindling piles
 * - Feed braziers to keep them burning (need 4 total kindling)
 * - Attack the demon while avoiding ice barrage projectiles
 * - Dodge by moving to tiles not targeted by projectiles
 * - Use Protect from Missiles when attacking
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name = "Ice Demon", priority = 10000, blocking = true)
public class IceDemonTask extends CoxTaskBase {

    /** Current room information */
    private NHelper currentRoom;

    /** Next room information */
    private NHelper nextRoom;

    /** Current room index */
    private int roomIndex;

    /** Projectile ID for ice barrage attack */
    private static final int ICE_BARRAGE_PROJECTILE_ID = 1324;

    /** NPC name for Ice Demon */
    private static final String ICE_DEMON_NAME = "Ice demon";

    /** NPC name for Ice Demon's weaker form */
    private static final String FROZEN_ICE_DEMON_NAME = "Frozen";

    /** Object name for kindling pile */
    private static final String KINDLING_PILE_NAME = "Kindling";

    /** Object name for brazier */
    private static final String BRAZIER_NAME = "Brazier";

    /** Item name for kindling */
    private static final String KINDLING_ITEM_NAME = "Kindling";

    /** Item ID for kindling */
    private static final int KINDLING_ITEM_ID = 20706;

    /** Action for taking items */
    private static final String TAKE_ACTION = "Take";

    /** Action for lighting brazier */
    private static final String LIGHT_ACTION = "Light";

    /** Action for attacking */
    private static final String ATTACK_ACTION = "Attack";

    /** Passage/entrance object name */
    private static final String PASSAGE_NAME = "Passage";

    /** Enter action */
    private static final String ENTER_ACTION = "Enter";

    /** Maximum kindling to keep in inventory */
    private static final int MAX_KINDLING = 10;

    @Inject
    protected IceDemonTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.roomIndex = 0;
    }

    /**
     * Check if this task should be active
     * @return true if we're in the Ice Demon room
     */
    @Override
    public boolean shouldExecute() {
        this.currentRoom = this.coxManager.getCurrentRoom();
        this.roomIndex = this.coxManager.getRoomIndex();
        this.nextRoom = this.coxManager.getNextRoom();
        return this.currentRoom.getRoomType() == RoomType.ICE_DEMON;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return EquipmentManager.getEquipmentForRoom(RoomType.ICE_DEMON);
    }

    /**
     * Get prayers to use during Ice Demon fight
     * @return List of prayers including Protect from Missiles and offensive prayers
     */
    @Override
    public List&lt;Prayer&gt; getPrayersToActivate() {
        ArrayList&lt;Prayer&gt; prayers = new ArrayList&lt;&gt;();

        // Find ice demon NPC
        NPC iceDemon = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(ICE_DEMON_NAME)
        );

        // Find frozen ice demon (weaker form)
        NPC frozenDemon = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(FROZEN_ICE_DEMON_NAME)
        );

        // Only pray when ice demon is active (not frozen)
        if (iceDemon == null &amp;&amp; frozenDemon != null) {
            prayers.addAll(Prayers.getOffensive());
            prayers.add(Prayer.PROTECT_FROM_MISSILES);
            return prayers;
        }

        return null;
    }

    /**
     * Execute the main Ice Demon task logic
     * @return true if task executed successfully
     */
    @Override
    public boolean execute() {
        NPC iceDemon = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(ICE_DEMON_NAME)
        );

        NPC frozenDemon = NPCs.getNearest(npc -&gt;
            npc.getName() != null &amp;&amp;
            npc.getName().contains(FROZEN_ICE_DEMON_NAME)
        );

        // Calculate how much kindling we need
        int currentKindling = this.coxManager.getBraziersLit();
        int woodcuttingLevel = Skills.getLevel(Skill.WOODCUTTING);
        int kindlingNeeded = 4 - currentKindling + (50 - woodcuttingLevel) / 10;

        // Collect kindling if needed
        if (kindlingNeeded &gt; 0 &amp;&amp; collectKindling()) {
            return true;
        }

        // If both demons are null, navigate to next room
        if (iceDemon == null &amp;&amp; frozenDemon == null) {
            return navigateToNextRoom();
        }

        // If frozen demon died, reset kindling state
        if (frozenDemon != null &amp;&amp; frozenDemon.isDead()) {
            System.out.println("Ice demon defeated!");
            this.coxManager.resetBrazierCount();
        }

        // Attack frozen demon when it appears
        if (iceDemon == null) {
            // Check for incoming ice barrage projectiles
            Projectile iceBarrage = Projectiles.getNearest(projectile -&gt;
                projectile.getId() == ICE_BARRAGE_PROJECTILE_ID &amp;&amp;
                this.localPlayer.getWorldLocation()
                    .createWorldArea(1)
                    .toWorldPointList()
                    .contains(WorldPoint.fromLocal(this.client, projectile.getTarget()))
            );

            // If projectile targeting us, dodge to safespot
            if (iceBarrage != null) {
                System.out.println(WorldPoint.fromLocal(this.client, iceBarrage.getTarget()));
                System.out.println(this.localPlayer.getWorldLocation());
                Movement.setDestination(findSafespotFromProjectiles());
                return true;
            }

            // Attack the frozen demon
            if (this.localPlayer.getInteracting() != null &amp;&amp;
                this.localPlayer.getInteracting().getName() != null &amp;&amp;
                this.localPlayer.getInteracting().getName().contains(ICE_DEMON_NAME)) {
                return true;
            }

            frozenDemon.interact(ATTACK_ACTION);
            return true;
        }

        // Light braziers when ice demon is active
        if (kindlingNeeded &gt; 0) {
            int kindlingCount = Inventory.getCount(true, KINDLING_ITEM_ID);

            if (kindlingCount &lt; kindlingNeeded || kindlingCount &gt;= MAX_KINDLING) {
                TileObject brazier = TileObjects.getNearest(tileObject -&gt;
                    tileObject.getName() != null &amp;&amp;
                    tileObject.getName().contains(BRAZIER_NAME) &amp;&amp;
                    tileObject.hasAction(LIGHT_ACTION)
                );

                if (brazier == null) {
                    return true;
                }

                if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
                    return true;
                }

                brazier.interact(LIGHT_ACTION);
                return true;
            }

            // Collect more kindling if we don't have enough
            if (Inventory.isFull()) {
                int[] kindlingIds = {KINDLING_ITEM_ID};
                if (!Inventory.contains(kindlingIds)) {
                    this.coxManager.dropLowestValueItem();
                    return true;
                }
            }

            TileObject kindlingPile = TileObjects.getNearest(tileObject -&gt;
                tileObject.getName() != null &amp;&amp;
                tileObject.getName().contains(KINDLING_PILE_NAME) &amp;&amp;
                tileObject.hasAction(TAKE_ACTION)
            );

            if (kindlingPile == null) {
                return true;
            }

            if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
                return true;
            }

            kindlingPile.interact(TAKE_ACTION);
        }

        return true;
    }

    /**
     * Collect kindling from kindling piles
     * @return true if collection is in progress
     */
    private boolean collectKindling() {
        // Check for regular kindling in inventory
        if (Inventory.contains(item -&gt;
            item.getName() != null &amp;&amp;
            item.getName().contains(KINDLING_ITEM_NAME) &amp;&amp;
            !item.getName().contains("Twisted") &amp;&amp;
            item.getId() != KINDLING_ITEM_ID
        )) {
            if (Inventory.isFull()) {
                this.coxManager.dropLowestValueItem();
                return true;
            }

            TileObject kindlingPile = TileObjects.getNearest(tileObject -&gt;
                tileObject.getName() != null &amp;&amp;
                tileObject.getName().contains(KINDLING_PILE_NAME) &amp;&amp;
                tileObject.hasAction(TAKE_ACTION)
            );

            if (kindlingPile == null) {
                return false;
            }

            kindlingPile.interact(TAKE_ACTION);
            return true;
        }

        // Check for twisted kindling
        String[] twistedKindling = {KINDLING_ITEM_NAME};
        if (Inventory.contains(twistedKindling)) {
            if (Inventory.isFull()) {
                this.coxManager.dropLowestValueItem();
                return true;
            }

            TileObject twistedPile = TileObjects.getNearest(tileObject -&gt;
                tileObject.getName() != null &amp;&amp;
                tileObject.getName().contains("Twisted") &amp;&amp;
                tileObject.hasAction(TAKE_ACTION)
            );

            if (twistedPile == null) {
                return false;
            }

            twistedPile.interact(TAKE_ACTION);
            return true;
        }

        return false;
    }

    /**
     * Find a safe spot away from ice barrage projectiles
     * @return WorldPoint representing a safe location
     */
    private WorldPoint findSafespotFromProjectiles() {
        System.out.println("Finding safespot from projectiles");

        String[] iceDemonNames = {ICE_DEMON_NAME};
        NPC iceDemon = NPCs.getNearest(iceDemonNames);

        // Create areas to check - inner danger zone and outer safe zone
        List&lt;WorldPoint&gt; innerArea = new WorldArea(
            iceDemon.getWorldLocation().dx(-2).dy(-2),
            5,
            5
        ).toWorldPointList();

        List&lt;WorldPoint&gt; outerArea = new WorldArea(
            iceDemon.getWorldLocation().dx(-3).dy(-3),
            7,
            7
        ).toWorldPointList();

        // Remove inner area from outer area to get safe zone
        outerArea.removeIf(innerArea::contains);

        // Find best safespot - walkable and not targeted by projectiles
        WorldPoint safespot = outerArea.stream()
            .filter(point -&gt; {
                if (!Reachable.isWalkable(point)) {
                    return false;
                }

                // Check if any projectile is targeting this point
                Projectile targetingProjectile = Projectiles.getNearest(projectile -&gt;
                    projectile.getId() == ICE_BARRAGE_PROJECTILE_ID &amp;&amp;
                    point.createWorldArea(1).contains(
                        WorldPoint.fromLocal(this.client, projectile.getTarget())
                    )
                );

                return targetingProjectile == null;
            })
            .min(Comparator.comparingInt(point -&gt;
                point.distanceTo((Locatable) this.localPlayer)
            ))
            .orElse(null);

        System.out.println("Safespot: " + safespot + " | player: " + this.localPlayer.getWorldLocation());
        return safespot;
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
            return true;
        }

        TileObject passage = findPassage();
        if (passage == null) {
            Movement.setDestination(this.currentRoom.getCenterLocation().dx(4).dy(4));
            return true;
        }

        if (this.localPlayer.isMoving() || this.localPlayer.isAnimating()) {
            return true;
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
}
