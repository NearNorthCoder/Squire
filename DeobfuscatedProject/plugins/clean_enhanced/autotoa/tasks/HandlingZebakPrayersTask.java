/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.KephriManager;
import gg.squire.autotoa.tasks.FHelper;
import gg.squire.autotoa.tasks.PrayerMode;

/**
 * Handles prayer switching for Zebak boss fight.
 *
 * Attack Patterns:
 * - Magic attack: Projectile ID 18565, use Protect from Magic
 * - Ranged attacks: Any projectile in FHelper.RANGED_PROJECTILE_IDS, use Protect from Missiles
 * - Blood cloud: Graphic ID 1401, causes damage zone that requires Protect from Magic
 *   Blood cloud lasts for 2 ticks, then returns to normal prayer
 * - Low health phase: When Zebak is below 25% HP and blood cloud is active,
 *   prioritize Protect from Magic for the blood cloud damage
 */
@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends KephriManager {
    // NPC IDs
    private static final int ZEBAK_NPC_ID = 11730;
    private static final int ZEBAK_VARIANT_NPC_ID = 11732;

    // Projectile and Graphics IDs
    private static final int MAGIC_PROJECTILE_ID = 18565;
    private static final int BLOOD_CLOUD_GRAPHIC_ID = 1401;

    // Health threshold for blood cloud priority
    private static final int HEALTH_PERCENTAGE_MAX = 100;
    private static final int LOW_HEALTH_THRESHOLD = 25;

    // Tick delay for blood cloud
    private static final int BLOOD_CLOUD_TICK_DELAY = 2;

    // Priority
    private static final int TASK_PRIORITY = 15700;

    // Current prayer to protect against attack
    private Prayer currentProtectionPrayer;

    // Tick when blood cloud will end
    private int bloodCloudTickEnd;

    @Inject
    public HandlingZebakPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.currentProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
    }

    @Override
    public boolean isInCorrectRegion() {
        return this.regionHelper.isNpcPresent((NPC npc) -> {
            if (npc.getId() != ZEBAK_NPC_ID || npc.getId() == ZEBAK_VARIANT_NPC_ID) {
                return true;
            } else {
                return false;
            }
        });
    }

    @Override
    public boolean isValid() {
        return true;
    }

    /**
     * Detects Zebak's attack type based on projectile.
     * - Magic projectile (18565): Use Protect from Magic
     * - Ranged projectiles: Use Protect from Missiles
     */
    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned projectileSpawned) {
        if (projectileSpawned.getProjectile().getId() == MAGIC_PROJECTILE_ID) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        } else if (FHelper.RANGED_PROJECTILE_IDS.contains(projectileSpawned.getProjectile().getId())) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    /**
     * Detects when blood cloud appears (Graphic ID 1401).
     * Blood cloud deals magic damage and lasts for 2 ticks.
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated graphicsObjectCreated) {
        if (graphicsObjectCreated.getGraphicsObject().getId() == BLOOD_CLOUD_GRAPHIC_ID) {
            this.bloodCloudTickEnd = Static.getClient().getTickCount() + BLOOD_CLOUD_TICK_DELAY;
        }
    }

    /**
     * Determines which prayers to use based on current situation:
     * 1. If blood cloud is active and Zebak is below 25% HP, prioritize Protect from Magic
     * 2. Otherwise, use the current protection prayer based on projectiles
     */
    @Override
    public List<Prayer> getPrayersToActivate() {
        NPC zebak = this.regionHelper.getTargetNpc();
        if (zebak == null) {
            return List.of(this.getOffensivePrayer(), this.currentProtectionPrayer);
        }

        // Calculate Zebak's current health percentage
        int healthPercentage = zebak.getHealthRatio() * HEALTH_PERCENTAGE_MAX / zebak.getHealthScale();

        // If blood cloud is active and health is below threshold, use Protect from Magic
        if (Static.getClient().getTickCount() == this.bloodCloudTickEnd && healthPercentage > LOW_HEALTH_THRESHOLD) {
            return List.of(this.getOffensivePrayer(), Prayer.PROTECT_FROM_MAGIC);
        }

        return List.of(this.getOffensivePrayer(), this.currentProtectionPrayer);
    }

    @Override
    public int getPriority() {
        return TASK_PRIORITY;
    }

    @Override
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }
}
