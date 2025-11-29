package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.Point;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/**
 * Handles the Boulder Dash combat challenge in Tombs of Amascut (Ba-Ba room).
 *
 * This challenge involves attacking boulders while dodging rolling boulders and
 * managing prayer/potions. The bot tracks boulder positions, attacks safe targets,
 * and avoids dangerous graphics overlays.
 */
@TaskDesc(name="Doing boulder dash", priority=100, blocking=true, register=true)
public class DoingBoulderDashTask extends KephriManager {

    // NPC IDs
    private static final int NPC_BOULDER_SMALL = 28511; // 0x6F5F - Small attackable boulder
    private static final int NPC_BOULDER_LARGE = 28479; // 0x6F3F - Large rolling boulder
    private static final int NPC_BABA = 11789; // 0x2E0D - Ba-Ba boss (for initial phase)

    // Animation and graphics IDs
    private static final int BABA_SLAM_ANIMATION = 12119; // 0x2F57 - Ba-Ba slam attack
    private static final int FALLING_DEBRIS_GRAPHIC = 245; // Falling debris warning

    // Scene coordinates for safe spots and movement
    private static final Point[] MOVEMENT_POSITIONS = new Point[] {
        new Point(20, 21),   // Starting safe position
        new Point(28, 21),   // Fallback position
        new Point(21, 26),   // Attack position top
        new Point(21, 20),   // Attack position middle
        new Point(21, 28),   // Attack position bottom
        new Point(32, 13),   // Edge positions
        new Point(32, 21)
    };

    // Arrays of boulder NPC IDs for filtering
    private static final int[] BOULDER_NPC_IDS = new int[] {28671, 28479};

    private final Set<NPC> damagedBoulders;    // Boulders we've already attacked
    private final Set<NPC> completedBoulders;  // Boulders that are destroyed
    private NPC currentTarget;                 // Currently targeted boulder
    private boolean safeToDodge;               // Safe to move to dodge area
    private int currentPhase;                  // Puzzle phase tracker
    private int ticksSinceLastAction;          // Cooldown counter
    private int lastBabaSlamTick;              // Tick when Ba-Ba slammed

    @Inject
    protected DoingBoulderDashTask(Client client, PuzzleStateManager stateManager, TOAConfig config, SquireAutoTOA plugin) {
        super(client, stateManager, config);
        this.damagedBoulders = new HashSet<>();
        this.completedBoulders = new HashSet<>();
        this.safeToDodge = false;
        this.currentPhase = 0;
        this.ticksSinceLastAction = 0;
        this.autoTOA = plugin;
    }

    @Override
    public void reset() {
        this.currentTarget = null;
        this.completedBoulders.clear();
        this.damagedBoulders.clear();
        this.safeToDodge = false;
        this.ticksSinceLastAction = 0;
    }

    @Override
    public boolean alwaysActive() {
        return true;
    }

    /**
     * Returns the combat equipment setup for this challenge.
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.babaBoulderAttackStyle();
    }

    /**
     * Drinks ranging potion if boost is low.
     */
    private void maintainRangingBoost() {
        Item rangingPotion = Inventory.getFirst(item -> item.getName().toLowerCase().contains("ranging"));
        if (rangingPotion == null) {
            return;
        }

        int maxBoost = BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED);
        if (Skills.getBoostedLevel(Skill.RANGED) > Skills.getLevel(Skill.RANGED) + maxBoost - 3) {
            return;
        }

        rangingPotion.interact("Drink");
    }

    /**
     * Main execution logic for the boulder challenge.
     */
    @Override
    public boolean executeChallenge() {
        NPC baba = this.getBaBa();
        if (baba == null) {
            this.reset();
            return false;
        }

        this.maintainRangingBoost();

        // Cooldown management
        if (this.ticksSinceLastAction > 0) {
            this.ticksSinceLastAction--;
            if (this.currentTarget == null || this.currentTarget.distanceTo(Players.getLocal()) < 4) {
                return true;
            }
        }

        // Track phase transitions
        if (this.currentPhase == 2 && this.getCurrentPhase() != 3 ||
            this.currentPhase == 1 && this.getCurrentPhase() == 2) {
            this.safeToDodge = true;
        }

        WorldPoint playerPos = Players.getLocal().getWorldLocation();
        this.currentPhase = this.getCurrentPhase();

        // Special handling during Ba-Ba dodge phase
        if (this.safeToDodge && baba.getId() == NPC_BABA) {
            if (!Movement.isRunEnabled()) {
                Movement.toggleRun();
            }

            WorldPoint safeSpot1 = this.sceneToWorld(new Point(6, 13));
            WorldPoint safeSpot2 = this.sceneToWorld(new Point(6, 21));
            WorldPoint playerLoc = Players.getLocal().getWorldLocation();

            WorldPoint closestSafe = safeSpot1.distanceTo2DHypotenuse(playerLoc) >
                                     safeSpot2.distanceTo2DHypotenuse(playerLoc) ?
                                     safeSpot2 : safeSpot1;

            Movement.setDestination(closestSafe);
            return true;
        }

        // Check for falling debris graphics (danger zone)
        if (Players.getLocal().getGraphic() == FALLING_DEBRIS_GRAPHIC) {
            this.safeToDodge = true;
        }

        if (!this.safeToDodge) {
            return false;
        }

        // Move east if Ba-Ba is blocking path
        if (baba.getWorldArea().getX() <= playerPos.getWorldX() && this.config.redX()) {
            if (this.sceneToWorld(MOVEMENT_POSITIONS[5]).getWorldX() >= playerPos.getWorldX()) {
                Movement.setDestination(playerPos.dx(1));
                return true;
            }
            this.safeToDodge = false;
            return false;
        }

        this.prepareForBoulderAttack();

        if (!Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        List<NPC> safeColumnBoulders = this.getBouldersInSafeColumn();
        WorldPoint startingPos = this.sceneToWorld(MOVEMENT_POSITIONS[0]);

        // Move to starting position if too far east
        if (startingPos.getWorldX() > playerPos.getWorldX()) {
            Movement.setDestination(startingPos);
            return true;
        }

        List<WorldPoint> attackPositions = List.of(
            this.sceneToWorld(MOVEMENT_POSITIONS[3]),
            this.sceneToWorld(MOVEMENT_POSITIONS[2]),
            this.sceneToWorld(MOVEMENT_POSITIONS[4])
        );

        List<WorldPoint> safePositions = List.of(
            this.sceneToWorld(MOVEMENT_POSITIONS[5]),
            this.sceneToWorld(MOVEMENT_POSITIONS[6])
        );

        int totalBoulders = NPCs.getAll(BOULDER_NPC_IDS).size();

        // No safe boulders - move to safe area or attack position
        if (safeColumnBoulders.isEmpty()) {
            WorldPoint targetPos = this.sceneToWorld(MOVEMENT_POSITIONS[1]);

            if (totalBoulders != 8 ||
                this.currentTarget != null && this.currentTarget.getWorldArea().contains(playerPos) && totalBoulders > 5) {
                targetPos = safePositions.stream()
                    .min(Comparator.comparingDouble(wp -> wp.distanceTo2DHypotenuse(playerPos)))
                    .orElse(null);
            }

            if (targetPos.getWorldX() > playerPos.getWorldX()) {
                Movement.setDestination(targetPos);
            }
            return true;
        }

        // Find next boulder to attack
        NPC targetBoulder = safeColumnBoulders.stream()
            .filter(npc -> npc.getId() == NPC_BOULDER_LARGE && !npc.isDead())
            .filter(npc -> !this.completedBoulders.contains(npc))
            .filter(npc -> npc != this.currentTarget)
            .findFirst()
            .orElse(null);

        // All boulders in column cleared - move or reposition
        if (targetBoulder == null) {
            WorldPoint attackPos = this.sceneToWorld(MOVEMENT_POSITIONS[3]);
            WorldPoint middlePos = this.sceneToWorld(MOVEMENT_POSITIONS[2]);
            WorldPoint bottomPos = this.sceneToWorld(MOVEMENT_POSITIONS[4]);

            if (this.currentTarget == null) {
                return false;
            }

            WorldArea targetArea = this.currentTarget.getWorldArea();
            WorldPoint bestPosition = Stream.of(attackPos, middlePos, bottomPos)
                .min(Comparator.comparingDouble(wp -> wp.distanceTo2DHypotenuse(targetArea.getCenter())))
                .orElse(null);

            // All attack positions clear - move east
            if (attackPositions.stream().allMatch(wp -> wp.getWorldX() <= playerPos.getWorldX())) {
                if (attackPositions.contains(playerPos)) {
                    bestPosition = playerPos.dx(1);
                } else if (targetArea.contains(playerPos) && totalBoulders > 5) {
                    bestPosition = safePositions.stream()
                        .min(Comparator.comparingDouble(wp -> wp.distanceTo2DHypotenuse(playerPos)))
                        .orElse(null);
                } else if (Math.abs(targetArea.getCenter().getWorldY() - playerPos.getWorldY()) > 1) {
                    bestPosition = new WorldPoint(
                        playerPos.getWorldX() + 2,
                        targetArea.getCenter().getWorldY(),
                        this.client.getPlane()
                    );
                } else {
                    if (totalBoulders <= 5) {
                        return true;
                    }
                    bestPosition = targetArea.getCenter();
                }
            }

            Movement.setDestination(bestPosition);
            return true;
        }

        // Attack the target boulder
        targetBoulder.interact("Attack");

        // Add attack cooldown if using special weapon
        if (Equipment.contains(item -> item.getName().contains("faerdhinen"))) {
            this.ticksSinceLastAction = 1;
        }

        this.currentTarget = targetBoulder;
        return true;
    }

    /**
     * Gets boulders in the same column (X coordinate) as the player.
     */
    private List<NPC> getBouldersInSafeColumn() {
        List<NPC> allBoulders = NPCs.getAll(BOULDER_NPC_IDS);
        int playerX = Players.getLocal().getWorldX();
        int targetX = playerX;

        // Find the X coordinate with no blocking boulders
        for (NPC boulder : allBoulders) {
            if (boulder.getWorldLocation().getX() >= playerX &&
                NPCs.getAll(npc -> isBlockingBoulder(boulder, playerX, npc)).isEmpty()) {
                targetX = boulder.getWorldLocation().getX();
            }
        }

        final int finalTargetX = targetX;
        return allBoulders.stream()
            .filter(npc -> npc.getWorldLocation().getX() == finalTargetX)
            .collect(Collectors.toList());
    }

    /**
     * Checks if a boulder is blocking the path to another boulder.
     */
    private static boolean isBlockingBoulder(NPC boulder, int targetX, NPC otherBoulder) {
        return otherBoulder.getId() == boulder.getId() &&
               otherBoulder.getWorldLocation().getX() != boulder.getWorldLocation().getX() &&
               otherBoulder.getWorldArea().getX() + otherBoulder.getWorldArea().getWidth() > boulder.getWorldLocation().getX() &&
               otherBoulder.getWorldArea().getX() >= targetX;
    }

    /**
     * Tracks when boulders take damage.
     */
    @Subscribe
    public void onStatChanged(StatChanged event) {
        if (this.currentTarget != null) {
            this.damagedBoulders.add(this.currentTarget);
        }
    }

    /**
     * Tracks Ba-Ba's slam animation to predict boulder spawns.
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        if (event.getActor() == this.getBaBa() &&
            event.getActor().getAnimation() == BABA_SLAM_ANIMATION) {
            this.lastBabaSlamTick = Static.getClient().getTickCount();
        }
    }
}
