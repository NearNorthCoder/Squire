/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import gg.squire.autotoa.tasks.KephriManager;
import gg.squire.autotoa.tasks.FHelper;
import gg.squire.autotoa.tasks.PrayerMode;

/**
 * Handles prayer switching for Tumeken's Warden Phase 3.
 *
 * Attack Patterns:
 * - Magic attack: NPC spawns with graphic ID 2250, use Protect from Magic
 * - Ranged attack: NPC spawns without magic graphic, use Protect from Missiles
 * - Projectile ID 2181 indicates magic attack
 * - All other projectiles from FHelper.RANGED_PROJECTILE_IDS indicate ranged
 */
@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingTumekenP3PrayersTask
extends KephriManager {
    // NPC IDs and Graphics
    private static final int TUMEKEN_WARDEN_NPC_ID = 11680;
    private static final int MAGIC_GRAPHIC_ID = 2250;
    private static final int MAGIC_PROJECTILE_ID = 2181;

    // Region IDs for Tumeken room
    private static final int REGION_ID_1 = 27090;
    private static final int REGION_ID_2 = 11732;

    // Priority
    private static final int TASK_PRIORITY = 16192;

    // Current prayer to protect against attack
    private Prayer currentProtectionPrayer;

    @Inject
    public HandlingTumekenP3PrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.currentProtectionPrayer = null;
    }

    @Override
    public boolean isInCorrectRegion() {
        int[] regionIds = new int[2];
        regionIds[0] = REGION_ID_1;
        regionIds[1] = REGION_ID_2;
        return this.regionHelper.isInRegions(regionIds);
    }

    @Override
    public boolean isValid() {
        return this.isInCorrectRegion();
    }

    /**
     * Detects Tumeken's Warden attack type based on NPC spawn.
     * If the spawned NPC has the magic graphic, switch to Protect from Magic.
     * Otherwise, switch to Protect from Missiles.
     */
    @Subscribe
    public void onNpcSpawned(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (npc.getId() == TUMEKEN_WARDEN_NPC_ID) {
            Prayer prayer;
            if (npc.getGraphic() == MAGIC_GRAPHIC_ID) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.currentProtectionPrayer = prayer;
        }
    }

    /**
     * Detects Tumeken's Warden attack type based on projectile.
     * Magic projectile: ID 2181, use Protect from Magic
     * Ranged projectiles: Any ID in FHelper.RANGED_PROJECTILE_IDS, use Protect from Missiles
     */
    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (projectile.getId() == MAGIC_PROJECTILE_ID) {
            this.currentProtectionPrayer = Prayer.PROTECT_FROM_MAGIC;
        } else if (FHelper.RANGED_PROJECTILE_IDS.contains(projectile.getId())) {
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
    public PrayerMode getPrayerMode() {
        return PrayerMode.FLICK;
    }
}
