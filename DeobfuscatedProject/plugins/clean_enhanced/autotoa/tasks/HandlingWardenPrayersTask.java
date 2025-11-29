/*
 * Deobfuscated TOA Warden Prayer Handler
 * Manages prayer switching during the Warden boss fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;

/**
 * Task for handling prayer switching during the Warden fight.
 *
 * The Warden announces its attacks via game messages containing:
 * - "scimitar" = Melee attack - Protect from Melee
 * - "skull" = Magic attack - Protect from Magic
 * - "arrow" = Ranged attack - Protect from Missiles
 *
 * Also tracks animations for prayer timing.
 */
@TaskDesc(name = "Handling Warden Prayers", register = true, priority = Integer.MAX_VALUE)
public class HandlingWardenPrayersTask extends TOATaskBase {

    /** Attack type indicators in chat messages */
    private static final String MELEE_INDICATOR = "scimitar";
    private static final String MAGIC_INDICATOR = "skull";
    private static final String RANGED_INDICATOR = "arrow";

    /** Warden P1 core NPC IDs */
    private static final int WARDEN_CORE_ID_1 = 11751;
    private static final int WARDEN_CORE_ID_2 = 11754;

    /** Warden P2/P3 NPC IDs */
    private static final int WARDEN_P2_ID_1 = 11761;
    private static final int WARDEN_P2_ID_2 = 11762;
    private static final int WARDEN_P2_ID_3 = 11763;
    private static final int WARDEN_P2_ID_4 = 11764;
    private static final int WARDEN_P2_ID_5 = 11765;
    private static final int WARDEN_P2_ID_6 = 11766;

    /** Warden attack animation IDs */
    private static final int RANGED_ATTACK_ANIM = 9684;
    private static final int MAGIC_ATTACK_ANIM = 9685;

    /** Current protection prayer to use */
    private Prayer protectionPrayer;

    @Inject
    public HandlingWardenPrayersTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin.getClient(), plugin.getStateManager(), config);
    }

    /**
     * Handle chat messages for attack type detection
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        String message = chatMessage.getMessage();

        if (message.contains(MELEE_INDICATOR)) {
            protectionPrayer = Prayer.PROTECT_FROM_MELEE;
        } else if (message.contains(MAGIC_INDICATOR)) {
            protectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        } else if (message.contains(RANGED_INDICATOR)) {
            protectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    /**
     * Handle animation changes for attack detection
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();

        // Ignore player animations
        if (actor instanceof Player) {
            return;
        }

        int animation = actor.getAnimation();

        if (animation == RANGED_ATTACK_ANIM) {
            protectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        } else if (animation == MAGIC_ATTACK_ANIM) {
            protectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /**
     * Get the delay between prayer actions
     */
    public int getPrayerDelay() {
        return 4;
    }

    /**
     * Get the prayer flick mode
     */
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Check if we should activate prayers for this room
     */
    public boolean shouldActivatePrayers() {
        // Check for P1 cores
        int[] p1Ids = {WARDEN_CORE_ID_1, WARDEN_CORE_ID_2};
        if (NPCs.getNearest(p1Ids) != null) {
            return true;
        }

        // Check for P2/P3 wardens
        int[] p2Ids = {WARDEN_P2_ID_1, WARDEN_P2_ID_2, WARDEN_P2_ID_3, WARDEN_P2_ID_4, WARDEN_P2_ID_5, WARDEN_P2_ID_6};
        return isInRoom(p2Ids);
    }

    /**
     * Whether to use prayer flicking
     */
    public boolean usePrayerFlicking() {
        return shouldActivatePrayers();
    }

    /**
     * Get the prayers to activate this tick
     */
    public List<Prayer> getRequiredPrayers() {
        if (protectionPrayer == null) {
            return List.of(getOffensivePrayer());
        }
        return List.of(getOffensivePrayer(), protectionPrayer);
    }

    /**
     * Get the offensive prayer to use based on gear
     */
    private Prayer getOffensivePrayer() {
        return Prayer.PIETY; // Default, actual implementation checks weapon style
    }

    /**
     * Check if in room with given NPC IDs
     */
    private boolean isInRoom(int[] npcIds) {
        return stateManager.isInRoom(npcIds);
    }

    @Override
    protected boolean execute() {
        // Prayer handling is done via event subscriptions
        return false;
    }
}
