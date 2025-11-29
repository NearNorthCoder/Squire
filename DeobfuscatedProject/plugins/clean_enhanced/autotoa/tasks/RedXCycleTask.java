package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles the Red X cycle mechanic during TOA boss encounters.
 * This task manages player positioning when the boss performs attacks that
 * create red X markers on the ground (dangerous zones).
 *
 * The mechanic involves:
 * - Detecting graphics objects that indicate dangerous areas
 * - Moving to safe positions away from red X markers
 * - Cycling between two predefined positions (22, 36) and (22, 28)
 * - Managing run energy and attack timing to survive the mechanic
 *
 * The task tracks boss animations and graphics spawns to predict when
 * to dodge and when to attack, ensuring optimal DPS while staying safe.
 */
@TaskDesc(name="Red X Cycle", priority=50, register=true)
public class RedXCycleTask extends KephriManager {

    // Boss animation ID for the attack that triggers red X
    private static final int BOSS_RED_X_ANIMATION = 8717;

    // Graphics object IDs for different danger zones
    private static final int GRAPHICS_DANGER_ZONE = 2250;      // Red X graphics
    private static final int GRAPHICS_ATTACK_INDICATOR_1 = 9295;  // Attack indicator type 1
    private static final int GRAPHICS_ATTACK_INDICATOR_2 = 19880; // Attack indicator type 2

    // NPC ID threshold for special handling
    private static final int SPECIAL_NPC_THRESHOLD = 11780;

    // Timing constants (in game ticks)
    private static final int COOLDOWN_AFTER_GRAPHICS = 1;
    private static final int SHORT_ATTACK_DELAY = 2;
    private static final int LONG_ATTACK_DELAY = 4;
    private static final int ATTACK_TIMEOUT = 62;

    // Raiding level values
    private static final int RAID_LEVEL_EXPERT = 3;

    // Cycle positions for dodging
    private static final Point CYCLE_POSITION_1 = new Point(22, 36);
    private static final Point CYCLE_POSITION_2 = new Point(22, 28);

    // Death message to watch for
    private static final String DEATH_MESSAGE = "You have died";

    // Attack action
    private static final String ATTACK_ACTION = "Attack";

    // State tracking
    private int graphicsCooldownTick;
    private int lastAttackTick;
    private int tickCounter;

    @Inject
    protected RedXCycleTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
        this.graphicsCooldownTick = -1;
        this.tickCounter = 0;
        this.lastAttackTick = -1;
    }

    @Override
    public void reset() {
        this.graphicsCooldownTick = -1;
        this.tickCounter = -1;
    }

    @Override
    public boolean onBossDeath() {
        // Reset state when boss dies/mechanic ends
        this.reset();
        return super.onBossDeath();
    }

    @Override
    public boolean executeTask() {
        // Check if red X mechanic is active via config
        if (!this.config.redX()) {
            return false;
        }

        NPC targetNPC = this.getTargetNPC();
        if (targetNPC == null) {
            return false;
        }

        Set<WorldPoint> dangerZones = this.getDangerZones();
        Player localPlayer = Players.getLocal();

        // Check if we're in cooldown period after graphics spawn
        boolean inGraphicsCooldown = (this.client.getTickCount() == this.graphicsCooldownTick);

        if (inGraphicsCooldown) {
            // Graphics just spawned - need to dodge immediately
            WorldPoint bossCenter = targetNPC.getWorldArea().getCenter();

            // Find safe tile adjacent to boss that's not in a danger zone
            WorldPoint safeTile = bossCenter.createWorldArea(1)
                .toWorldPointList()
                .stream()
                // Must be exactly 1 tile away from boss center in both X and Y
                .filter(worldPoint ->
                    Math.abs(worldPoint.getWorldX() - bossCenter.getWorldX()) == 1 &&
                    Math.abs(worldPoint.getWorldY() - bossCenter.getWorldY()) == 1)
                .filter(Reachable::isWalkable)
                .filter(worldPoint -> !dangerZones.contains(worldPoint))
                .min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(localPlayer)))
                .orElse(null);

            // Ensure run is enabled for quick dodging
            if (!Movement.isRunEnabled()) {
                Movement.toggleRun();
            }

            Movement.setDestination(safeTile);
            return true;
        }

        // Handle boss attack animation
        if (targetNPC.getAnimation() == BOSS_RED_X_ANIMATION &&
            this.graphicsCooldownTick < this.client.getTickCount() &&
            !targetNPC.getWorldArea().contains(localPlayer)) {

            this.lastAttackTick = this.client.getTickCount();

            // Determine delay based on raid level
            int attackDelay = (this.getRaidLevel() == RAID_LEVEL_EXPERT) ? SHORT_ATTACK_DELAY : LONG_ATTACK_DELAY;
            this.graphicsCooldownTick = this.client.getTickCount() + attackDelay;
        }

        // Use cycle positions when not in immediate danger
        if (this.client.getTickCount() - this.tickCounter == 0 && this.getRaidLevel() != RAID_LEVEL_EXPERT) {
            // Ensure run is enabled
            if (!Movement.isRunEnabled()) {
                Movement.toggleRun();
            }

            // Alternate between two cycle positions
            WorldPoint cyclePos1 = this.toWorldPoint(CYCLE_POSITION_1);
            WorldPoint cyclePos2 = this.toWorldPoint(CYCLE_POSITION_2);
            WorldPoint playerLocation = localPlayer.getWorldLocation();

            // Choose the farthest position to maximize distance
            WorldPoint targetCyclePos = (cyclePos1.distanceTo2DHypotenuse(playerLocation) > 0) ? cyclePos2 : cyclePos1;

            // Don't move if target position is in danger zone
            if (dangerZones.contains(targetCyclePos)) {
                return true;
            }

            Movement.setDestination(targetCyclePos);
            return true;
        }

        // Return to attacking if we're already interacting with boss
        if (localPlayer.getInteracting() == targetNPC) {
            return true;
        }

        // Prepare to attack
        this.prepareAttack();

        // Attack the boss if we're in its area
        if (targetNPC.getWorldArea().contains(localPlayer) &&
            Movement.isRunEnabled() &&
            targetNPC.getId() != SPECIAL_NPC_THRESHOLD) {
            // Toggle run off to avoid misclicks
            Movement.toggleRun();
            this.tickCounter = this.client.getTickCount() + RAID_LEVEL_EXPERT;
            targetNPC.interact(ATTACK_ACTION);
        }

        // Force attack if we've been waiting too long
        if (this.client.getTickCount() - this.tickCounter > ATTACK_TIMEOUT) {
            targetNPC.interact(ATTACK_ACTION);
        }

        return true;
    }

    /**
     * Collects all danger zone positions from active graphics objects.
     * These represent the red X markers and other dangerous ground effects.
     *
     * @return Set of world points that are currently dangerous
     */
    private Set<WorldPoint> getDangerZones() {
        HashSet<WorldPoint> dangerZones = new HashSet<>();

        Iterator<GraphicsObject> iterator = this.client.getGraphicsObjects().iterator();
        while (iterator.hasNext()) {
            GraphicsObject graphicsObject = iterator.next();

            // Only track the specific danger zone graphics
            if (graphicsObject.getId() == GRAPHICS_DANGER_ZONE) {
                WorldPoint dangerLocation = WorldPoint.fromLocal(
                    this.client,
                    graphicsObject.getLocation()
                );
                dangerZones.add(dangerLocation);
            }
        }

        return dangerZones;
    }

    /**
     * Listens for graphics objects being created.
     * When danger graphics spawn, activates cooldown to trigger dodging.
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated graphicsObjectCreated) {
        // Ignore if already in cooldown
        if (this.graphicsCooldownTick > this.client.getTickCount()) {
            return;
        }

        int graphicsId = graphicsObjectCreated.getGraphicsObject().getId();
        WorldPoint graphicsLocation = WorldPoint.fromLocal(
            this.client,
            graphicsObjectCreated.getGraphicsObject().getLocation()
        );

        // Check if attack indicator spawned
        if (graphicsId == GRAPHICS_ATTACK_INDICATOR_1) {
            this.graphicsCooldownTick = this.client.getTickCount() + COOLDOWN_AFTER_GRAPHICS;
        }

        // Check if danger graphics spawned at player location
        if (graphicsId == GRAPHICS_ATTACK_INDICATOR_2 &&
            graphicsLocation.equals(Players.getLocal().getWorldLocation())) {
            this.graphicsCooldownTick = this.client.getTickCount() + COOLDOWN_AFTER_GRAPHICS;
        }
    }

    /**
     * Listens for player death to reset the task state.
     */
    @Subscribe
    public void onActorDeath(ActorDeath actorDeath) {
        if (actorDeath.getActor() == Players.getLocal()) {
            this.reset();
        }
    }

    /**
     * Listens for death message in chat to reset state.
     */
    @Override
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (message.contains(DEATH_MESSAGE)) {
            this.reset();
        }
    }
}
