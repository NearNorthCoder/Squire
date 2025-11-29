/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
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
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

/**
 * Handles prayer switching for Elidinis' Warden Phase 3.
 *
 * Attack Patterns:
 * - Animation 9777: Alternates between magic and ranged (opposite of current prayer)
 * - Animation 9772: Ranged attack, use Protect from Missiles
 * - Animation 9774: Magic attack, use Protect from Magic
 * - NPC ID 11777: Elidinis spawns initially, use Protect from Missiles as default
 */
@TaskDesc(name="Handling Elidinis P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingElidinisP3PrayersTask
extends AutotoaManager {
    // NPC and Animation IDs
    private static final int ELIDINIS_WARDEN_NPC_ID = 11777;
    private static final int ALTERNATE_ATTACK_ANIMATION_ID = 9777;
    private static final int RANGED_ATTACK_ANIMATION_ID = 9772;
    private static final int MAGIC_ATTACK_ANIMATION_ID = 9774;

    // Region IDs for Elidinis room
    private static final int REGION_ID_1 = 11761;
    private static final int REGION_ID_2 = 11763;

    // Priority
    private static final int TASK_PRIORITY = 15696;

    // Current prayer to protect against attack
    private Prayer currentProtectionPrayer;

    @Inject
    public HandlingElidinisP3PrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.currentProtectionPrayer = null;
    }

    @Override
    public boolean isInCorrectRegion() {
        int[] regionIds = new int[2];
        regionIds[0] = REGION_ID_1;
        regionIds[1] = REGION_ID_2;
        return this.cm.a(regionIds);
    }

    @Override
    public boolean isValid() {
        return this.isInCorrectRegion();
    }

    /**
     * Detects Elidinis' Warden attack type based on animation.
     * - Alternate attack (9777): Switches to opposite of current prayer
     * - Ranged attack (9772): Switches to Protect from Missiles
     * - Magic attack (9774): Switches to Protect from Magic
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (actor instanceof Player) {
            return;
        }

        if (actor.getAnimation() == ALTERNATE_ATTACK_ANIMATION_ID) {
            Prayer prayer;
            if (this.currentProtectionPrayer == Prayer.PROTECT_FROM_MISSILES) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.currentProtectionPrayer = prayer;
        } else if (actor.getAnimation() == RANGED_ATTACK_ANIMATION_ID) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        } else if (actor.getAnimation() == MAGIC_ATTACK_ANIMATION_ID) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /**
     * When Elidinis spawns, default to Protect from Missiles.
     */
    @Subscribe
    public void onNpcSpawned(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (npc.getId() == ELIDINIS_WARDEN_NPC_ID) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public List<Prayer> getPrayersToActivate() {
        if (this.currentProtectionPrayer == null) {
            return List.of(this.getOffensivePrayer());
        }
        return List.of(this.getOffensivePrayer(), this.currentProtectionPrayer);
    }

    @Override
    public int getPriority() {
        return TASK_PRIORITY;
    }

    @Override
    public GameEnum10 getPrayerMode() {
        return GameEnum10.FLICK;
    }
}
