package gg.squire.minigame.pestcontrol;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Task that handles attacking Pest Control monsters based on priority.
 * Targets the highest priority monsters first to protect the Void Knight.
 */
@TaskDesc(name = "Attacking")
public class AttackMonstersTask extends Task {
    private static final int MAX_ATTACK_DISTANCE = 15;
    private static final String ATTACK_ACTION = "Attack";

    private final PestControlNavigator navigator;

    /**
     * Creates a new attack task.
     *
     * @param navigator The navigation helper
     */
    @Inject
    public AttackMonstersTask(PestControlNavigator navigator) {
        this.navigator = navigator;
    }

    /**
     * Main task execution method.
     *
     * @return true to continue running, false to stop
     */
    @Override
    public boolean run() {
        if (shouldSkipAttacking()) {
            return false;
        }

        Optional<NPC> targetMonster = findBestMonsterToAttack();
        if (targetMonster.isPresent()) {
            attackMonster(targetMonster.get());
        } else {
            navigator.walkToLander();
        }

        return true;
    }

    /**
     * Determines if we should skip attacking this tick.
     *
     * @return true if should skip (already in combat, not in game, etc.)
     */
    private boolean shouldSkipAttacking() {
        return !navigator.isInGame() ||
                Players.getLocal().getInteracting() == null ||
                !Movement.shouldWalk();
    }

    /**
     * Finds the best monster to attack based on priority and distance.
     *
     * @return Optional containing the best target, or empty if none found
     */
    private Optional<NPC> findBestMonsterToAttack() {
        return NPCs.getAll().stream()
                .filter(this::isValidTarget)
                .min(this::compareMonsterPriority);
    }

    /**
     * Checks if an NPC is a valid target for attacking.
     *
     * @param npc The NPC to check
     * @return true if the NPC is a valid Pest Control monster within range
     */
    private boolean isValidTarget(NPC npc) {
        // Check if NPC is a known Pest Control monster
        boolean isPestControlMonster = Arrays.stream(PestControlMonster.values())
                .anyMatch(monster -> monster.getMonsterName().equals(npc.getName()));

        if (!isPestControlMonster) {
            return false;
        }

        // Check if within attack distance
        if (npc.getWorldLocation().distanceTo(Players.getLocal()) > MAX_ATTACK_DISTANCE) {
            return false;
        }

        // Check if has Attack action
        String[] actions = new String[]{"Attack"};
        return npc.hasAction(actions);
    }

    /**
     * Compares two NPCs by their monster priority.
     * Higher priority monsters (higher number) should be attacked first.
     *
     * @param npc1 First NPC
     * @param npc2 Second NPC
     * @return Comparison result for sorting
     */
    private int compareMonsterPriority(NPC npc1, NPC npc2) {
        PestControlMonster monster1 = PestControlMonster.valueOf(npc1.getName().toUpperCase());
        PestControlMonster monster2 = PestControlMonster.valueOf(npc2.getName().toUpperCase());

        // Higher priority should come first, so reverse the comparison
        return Integer.compare(monster2.getAttackPriority(), monster1.getAttackPriority());
    }

    /**
     * Attacks a monster or walks to it if not reachable.
     *
     * @param npc The monster to attack
     */
    private void attackMonster(NPC npc) {
        if (!Reachable.isInteractable(npc)) {
            Movement.walkTo(npc.getWorldLocation());
        } else if (!npc.isDead()) {
            npc.interact(ATTACK_ACTION);
        }
    }

    /**
     * Calculates the path distance to a location.
     *
     * @param regionX The region X coordinate
     * @param regionY The region Y coordinate
     * @param plane   The plane
     * @return The path length, or -1 if no path found
     */
    private int calculatePathDistance(int regionX, int regionY, int plane) {
        CollisionMap collisionMap;
        if (Static.getGlobalCollisionMap() instanceof GlobalCollisionMap) {
            collisionMap = Static.getGlobalCollisionMap();
        } else {
            collisionMap = null;
        }

        LocalCollisionMap localCollisionMap = new LocalCollisionMap((GlobalCollisionMap) collisionMap, 0);

        List<WorldPoint> path = new Pathfinder(
                localCollisionMap,
                Walker.buildTransportLinks(),
                List.of(Players.getLocal().getWorldLocation()),
                PestControlNavigator.toWorldPoint(new RegionPoint(regionX, regionY, plane, 12589)),
                RegionManager.avoidWilderness()
        ).find();

        return path != null ? path.size() : -1;
    }
}
