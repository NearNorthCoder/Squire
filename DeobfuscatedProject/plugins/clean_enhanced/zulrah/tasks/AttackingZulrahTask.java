/*
 * Deobfuscated Zulrah Attack Task
 * Handles attacking Zulrah during the fight
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

/**
 * Task responsible for attacking Zulrah during the fight.
 *
 * This task handles:
 * - Finding and targeting Zulrah
 * - Checking if we should attack (not during certain phases)
 * - Tracking eat timing to avoid wasting attacks
 * - Respecting phase mechanics (JAD phase, melee phase, etc.)
 */
@TaskDesc(name = "Attacking zulrah", priority = 35, register = true)
public class AttackingZulrahTask extends ZulrahTaskBase {

    private static final String NPC_NAME = "Zulrah";
    private static final String EAT_MESSAGE = "You eat";
    private static final int ANIMATION_NONE = -1;

    /** Tick when player last ate - used to avoid wasting attack ticks */
    private int lastEatTick = 0;

    /** Reference to main plugin */
    private final SquireZulrah plugin;

    @Inject
    protected AttackingZulrahTask(SquireZulrah plugin, ZulrahStateManager stateManager,
                                   Client client, SquireZulrahConfig config) {
        super(stateManager, client, config);
        this.plugin = plugin;
    }

    /**
     * Main task execution - decides whether to attack Zulrah
     *
     * Returns false (skip) if:
     * - Too soon after last action (tick delay)
     * - Zulrah not found, not animating, or dead
     * - Player is moving during initial phase
     * - During JAD phase waiting for prayer switch stability
     * - Player already attacking or just ate
     * - Player moving to melee phase safe spot
     *
     * @return true if action was taken, false otherwise
     */
    @Override
    public boolean execute() {
        // Don't attack too soon after last action
        if (client.getTickCount() - stateManager.getLastActionTick() <= 1) {
            return false;
        }

        // Find Zulrah NPC
        NPC zulrah = NPCs.getNearest(NPC_NAME);

        // Validate Zulrah is valid target
        if (zulrah == null || zulrah.getAnimation() == ANIMATION_NONE || zulrah.isDead()) {
            return false;
        }

        Player localPlayer = Players.getLocal();
        WorldPoint playerLocation = localPlayer.getWorldLocation();

        // Get current phase from rotation tracker
        ZulrahPhase currentPhase = stateManager.getCurrentRotation().getCurrentPhase();

        // Don't attack during initial movement to first safe spot
        if (localPlayer.isMoving() && currentPhase == ZulrahPhase.INITIAL) {
            return false;
        }

        // During JAD phase, wait for at least 3 attacks before engaging
        // This ensures prayer switching is stable before we start attacking
        if (currentPhase == ZulrahPhase.JAD_PHASE_W && stateManager.getJadAttackCount() >= 3) {
            return false;
        }

        // Don't attack if already targeting something or just ate (would waste tick)
        if (localPlayer.getInteracting() != null ||
            client.getTickCount() - lastEatTick <= 1) {
            return false;
        }

        // Don't attack during melee phase while moving to NW safe spot
        if (localPlayer.isMoving() && currentPhase == ZulrahPhase.MAGMA_CENTER_NW) {
            return false;
        }

        // All checks passed - attack Zulrah
        zulrah.interact("Attack");
        sleep(1);

        return true;
    }

    /**
     * Track when player eats to avoid attacking immediately after
     * (eating and attacking same tick wastes the attack)
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getMessage().contains(EAT_MESSAGE)) {
            this.lastEatTick = client.getTickCount();
        }
    }
}
