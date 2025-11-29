/*
 * Deobfuscated TOA Kephri Attack Task
 * Handles attacking Kephri, the scarab boss
 */
package gg.squire.autotoa.tasks;

import javax.inject.Inject;
import javax.inject.Singleton;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;

/**
 * Task for attacking Kephri, the scarab boss in Path of Scabaras.
 *
 * Kephri mechanics handled:
 * - Swarm phase detection and gear swapping
 * - Scarab add management
 * - Shield phase timing
 * - Melee range detection for phase changes
 */
@Singleton
@TaskDesc(name = "Attacking kephri", priority = 10, register = true)
public class AttackingKephriTask extends TOATaskBase {

    /** Message indicating Kephri is out of reach (shield phase) */
    private static final String REACH_MESSAGE = " reach";

    /** Message indicating raid failed */
    private static final String FAIL_MESSAGE = "failed to complete";

    /** Swarm NPC name */
    private static final String SWARM_NAME = "Swarm";

    /** Tick threshold for reach detection */
    private static final int REACH_TICK_THRESHOLD = 5;

    /** Whether currently in shield/unreachable phase */
    private boolean inShieldPhase;

    /** Tick when reach message was received */
    private int reachMessageTick;

    /** Reference to main plugin */
    @Inject
    private SquireAutoTOA plugin;

    @Inject
    protected AttackingKephriTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    /**
     * Handle chat messages for phase detection
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();

        // Detect reach message (Kephri shields)
        if (message.contains(REACH_MESSAGE) && client.getTickCount() - reachMessageTick < REACH_TICK_THRESHOLD) {
            inShieldPhase = true;
        }

        // Detect fail message
        if (message.contains(FAIL_MESSAGE)) {
            inShieldPhase = false;
        }
    }

    /**
     * Reset state for new fight
     */
    public void reset() {
        reachMessageTick = 0;
        inShieldPhase = false;
        stateManager.setKephriPhase(KephriPhase.ATTACK);
    }

    /**
     * Get gear setup based on current phase
     */
    public ConfigStorageBox<EquipmentSetup> getGearSetup() {
        if (inShieldPhase) {
            // During shield phase, use range or mage based on butterfly setting
            if (config.butterfly()) {
                return config.mageGearAkkha();
            }
            return config.rangeGearAkkha();
        }
        return getDefaultGearSetup();
    }

    /**
     * Check if special attack should be used
     */
    public boolean shouldUseSpecial() {
        return inShieldPhase;
    }

    /**
     * Get special attack gear setup
     */
    public ConfigStorageBox<EquipmentSetup> getSpecialGearSetup() {
        return config.kephriSpecialGear();
    }

    @Override
    protected boolean execute() {
        Player player = Players.getLocal();
        Actor interacting = player.getInteracting();

        // If already attacking a swarm, don't re-target Kephri
        if (interacting != null && !interacting.getName().contains(SWARM_NAME)) {
            return false;
        }

        // Find Kephri NPC
        NPC kephri = findKephri();
        if (kephri == null) {
            inShieldPhase = false;
            return false;
        }

        // Check if we should attack
        if (!shouldAttackKephri() || shouldSkipForSwarms()) {
            return false;
        }

        // If in melee range, exit shield phase
        if (kephri.getWorldArea().isInMeleeDistance(player.getWorldLocation())) {
            inShieldPhase = false;
        }

        // Set attack state
        setAttackingNPC(kephri, 1);

        // Attack Kephri
        kephri.interact("Attack");

        // Notify plugin of attack
        plugin.onKephriAttack();

        // Track attack tick
        reachMessageTick = client.getTickCount();

        return true;
    }

    /**
     * Find Kephri NPC
     */
    private NPC findKephri() {
        return stateManager.findKephriNPC();
    }

    /**
     * Check if we should attack Kephri this tick
     */
    private boolean shouldAttackKephri() {
        return stateManager.canAttackKephri();
    }

    /**
     * Check if we should skip attacking to deal with swarms
     */
    private boolean shouldSkipForSwarms() {
        return stateManager.hasActiveSwarms();
    }

    /**
     * Get default gear setup
     */
    private ConfigStorageBox<EquipmentSetup> getDefaultGearSetup() {
        return config.kephriGear();
    }

    /**
     * Set currently attacking NPC
     */
    private void setAttackingNPC(NPC npc, int priority) {
        stateManager.setAttackingNPC(npc, priority);
    }
}
