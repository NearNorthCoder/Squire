/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

/**
 * Skips certain DPS phases during the Akkha fight by positioning strategically.
 * During Akkha's shadow phase, this task moves the player to specific positions
 * to minimize time spent DPSing the shadows, allowing for faster completion.
 *
 * The task tracks shadow spawns and moves the player near them during invulnerable phases.
 */
@TaskDesc(name="Skipping Akkha DPS", priority=150, blocking=true, register=true)
public class SkippingAkkhaDpsTask extends TOABossHandler {
    // NPC ID for Akkha boss
    private static final int AKKHA_NPC_ID = 15710;  // 0x3D5E

    // Animation ID for Akkha's special attack
    private static final int AKKHA_SPECIAL_ANIMATION = 9779;  // 0x2633

    // Search radius for shadows
    private static final int SHADOW_SEARCH_RADIUS = 6;

    // Track skipping status
    private boolean skippingPhase;
    private int skipAttempts;

    @Inject
    protected SkippingAkkhaDpsTask(Client client, TOARaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    public boolean validate() {
        // Get the current room phase
        TOARoomPhase phase = this.getCurrentPhase();
        if (phase == null) {
            return false;
        }

        // Get the world location for this phase
        WorldPoint phaseLocation = phase.getWorldLocation(this.client);

        // Find Akkha's shadow near the phase location
        NPC shadow = NPCs.getNearest(phaseLocation, npc -> {
            return npc.getName().equals("Akkha's Shadow") &&
                   npc.getWorldLocation().distanceTo(phaseLocation) < SHADOW_SEARCH_RADIUS;
        });

        // No shadow found or shadow is dead
        if (shadow == null || shadow.isDead()) {
            return false;
        }

        // Find the main Akkha NPC
        int[] akkhaIds = new int[] { AKKHA_NPC_ID };
        NPC akkha = NPCs.getNearest(akkhaIds);

        // Akkha not found or is at health threshold
        if (akkha == null || akkha.getHealthRatio() == -1) {
            return false;
        }

        // Don't skip if Wardens warden is active
        if (this.isWardenActive()) {
            return false;
        }

        // Check if Akkha is almost defeated (health ratio + 5 >= health scale)
        // and not doing the special animation
        if (akkha.getHealthRatio() + 5 < akkha.getHealthScale() &&
            akkha.getAnimation() == AKKHA_SPECIAL_ANIMATION) {
            return false;
        }

        // Get the shadow's world area
        WorldArea shadowArea = shadow.getWorldArea();

        // Find the closest point in the shadow area to the phase location
        WorldPoint closestPoint = shadowArea.toWorldPointList().stream()
            .min(Comparator.comparingDouble(point ->
                point.distanceTo2DHypotenuse(phaseLocation)))
            .orElse(null);

        if (closestPoint == null) {
            return false;
        }

        // Find the farthest point in the shadow area from the phase location
        WorldPoint farthestPoint = shadowArea.toWorldPointList().stream()
            .max(Comparator.comparingDouble(point ->
                point.distanceTo2DHypotenuse(phaseLocation)))
            .orElse(null);

        if (farthestPoint == null) {
            return false;
        }

        // Determine target point based on shadow's animation frame
        // If animation frame > 1, go to farthest point, otherwise closest
        WorldPoint targetPoint = closestPoint;
        if (shadow.getAnimationFrame() > 1) {
            targetPoint = farthestPoint;
        }

        // Move to the target point
        Movement.setDestination(targetPoint);
        return true;
    }
}
