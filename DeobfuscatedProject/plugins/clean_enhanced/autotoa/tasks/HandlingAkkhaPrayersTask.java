/*
 * Deobfuscated TOA Akkha Prayer Handler
 * Manages prayer switching during the Akkha boss fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.client.Static;

/**
 * Task for handling prayer switching during the Akkha fight.
 *
 * Akkha has three forms that require different protection prayers:
 * - Melee form (ID 11789) - Protect from Melee
 * - Ranged form (ID 11790) - Protect from Missiles
 * - Magic form (ID 11791) - Protect from Magic
 *
 * Also tracks Akkha's attacks via animations and projectiles
 * for more precise prayer timing.
 */
@TaskDesc(name = "Handling Akkha Prayers", priority = Integer.MAX_VALUE, register = true)
public class HandlingAkkhaPrayersTask extends TOATaskBase {

    /** Akkha NPC IDs for different forms */
    private static final int AKKHA_MELEE_ID = 11789;
    private static final int AKKHA_RANGED_ID = 11790;
    private static final int AKKHA_MAGIC_ID = 11791;

    /** Akkha Shadow NPC ID (final phase) */
    private static final int AKKHA_SHADOW_ID = 11793;

    /** Akkha attack animation IDs */
    private static final int MELEE_ATTACK_ANIM = 9774;
    private static final int RANGED_ATTACK_ANIM = 9782;
    private static final int MAGIC_ATTACK_ANIM = 9775;

    /** Memory orb projectile ID */
    private static final int MEMORY_PROJECTILE_ID = 2187;

    /** Prayer based on Akkha's current form */
    private Prayer formProtectionPrayer;

    /** Prayer based on incoming attack */
    private Prayer attackProtectionPrayer;

    /** Tick when last attack was detected */
    private int lastAttackTick;

    @Inject
    public HandlingAkkhaPrayersTask(SquireAutoTOA plugin, TOAConfig config) {
        super(plugin.getClient(), plugin.getStateManager(), config);
        this.attackProtectionPrayer = Prayer.PROTECT_FROM_MELEE;
        this.formProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
    }

    /**
     * Check if we should activate prayers for this room
     */
    public boolean shouldActivatePrayers() {
        int[] akkhaIds = {AKKHA_MELEE_ID, AKKHA_RANGED_ID, AKKHA_MAGIC_ID, AKKHA_SHADOW_ID};
        return isInRoom(akkhaIds);
    }

    /**
     * Get the delay between prayer actions
     */
    public int getPrayerDelay() {
        return 4;
    }

    /**
     * Whether to use prayer flicking
     */
    public boolean usePrayerFlicking() {
        return true;
    }

    /**
     * Get the prayer flick mode
     */
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }

    /**
     * Event handler for NPC form changes
     * Updates protection prayer based on Akkha's current form
     */
    @Subscribe
    public void onNpcChanged(NpcChanged event) {
        NPC npc = event.getNpc();

        if (npc.getId() == AKKHA_MELEE_ID) {
            formProtectionPrayer = Prayer.PROTECT_FROM_MELEE;
        } else if (npc.getId() == AKKHA_RANGED_ID) {
            formProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        } else if (npc.getId() == AKKHA_MAGIC_ID) {
            formProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /**
     * Event handler for animation changes
     * Detects incoming attacks for precise prayer timing
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();

        // Ignore player animations
        if (actor instanceof Player) {
            return;
        }

        // Only track Akkha NPCs
        int npcId = ((NPC) actor).getId();
        if (npcId != AKKHA_MELEE_ID && npcId != AKKHA_RANGED_ID && npcId != AKKHA_MAGIC_ID) {
            return;
        }

        int animation = actor.getAnimation();

        if (animation == MELEE_ATTACK_ANIM) {
            attackProtectionPrayer = Prayer.PROTECT_FROM_MELEE;
        } else if (animation == RANGED_ATTACK_ANIM) {
            attackProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        } else if (animation == MAGIC_ATTACK_ANIM) {
            attackProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        }

        lastAttackTick = Static.getClient().getTickCount() + 4;
    }

    /**
     * Get the prayers to activate this tick
     */
    public List<Prayer> getRequiredPrayers() {
        NPC akkha = NPCs.getNearest("Akkha");
        if (akkha == null) {
            return List.of(getOffensivePrayer());
        }

        // Reset attack prayer if timeout expired
        if (Static.getClient().getTickCount() >= lastAttackTick) {
            attackProtectionPrayer = formProtectionPrayer;
        }

        // Check for memory orb projectiles
        boolean hasMemoryOrb = !Projectiles.getAll(MEMORY_PROJECTILE_ID).isEmpty();

        // If melee form, not animating, and no orbs, use form prayer
        if (!hasMemoryOrb && formProtectionPrayer == Prayer.PROTECT_FROM_MELEE && !akkha.isAnimating()) {
            attackProtectionPrayer = formProtectionPrayer;
        }

        // Shadow Akkha always uses magic
        if (akkha.getId() == AKKHA_SHADOW_ID) {
            attackProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        }

        return List.of(getOffensivePrayer(), attackProtectionPrayer);
    }

    /**
     * Get the offensive prayer to use based on gear
     */
    private Prayer getOffensivePrayer() {
        // Return appropriate offensive prayer based on equipped weapon
        return Prayer.PIETY; // Default, actual implementation checks weapon style
    }

    @Override
    protected boolean execute() {
        // Prayer handling is done via event subscriptions
        return false;
    }
}
