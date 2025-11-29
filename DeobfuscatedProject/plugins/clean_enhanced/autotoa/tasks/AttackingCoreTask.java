package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/**
 * Task for attacking the Core during Wardens P3 in TOA.
 *
 * This task:
 * - Detects when Core appears
 * - Equips weapon (keris/shadow) when safe
 * - Attacks the Core NPC
 * - Tracks core projectiles to time weapon equipping
 * - Drinks nectar for overload if configured
 * - Uses appropriate prayers
 */
@TaskDesc(name = "Attacking core", priority = 50, blocking = true, register = true)
public class AttackingCoreTask extends AutotoaManager {
    private static final int CORE_NPC_ID = 11751;
    private static final int WARDEN_ANIMATION_1 = 9674; // Safe to equip weapon
    private static final int WARDEN_ANIMATION_2 = 9678; // Safe to equip weapon
    private static final int KERIS_ID = 27690; // Keris partisan of the sun
    private static final int SHADOW_ID = 25736; // Tumeken's shadow
    private static final int BASE_TICKS_SAFE = 81; // Base ticks until safe to equip
    private static final int TICKS_PER_PROJECTILE = 6; // Additional ticks per projectile
    private static final int NECTAR_PRAYER_THRESHOLD = 14550; // Drink nectar when prayer below
    private static final int NECTAR_ID_1 = 27348; // Nectar of zamorak
    private static final int NECTAR_ID_2 = 27230; // Other nectar variant
    private static final int CORE_PROJECTILE_ID = 2042; // Core projectile
    private static final int WARDEN_SPAWN_DELAY = 31; // Ticks to wait for warden

    private int coreProjectileCount;
    private int lastWeaponEquipTick;
    private boolean hasEquippedWeapon;

    @Inject
    protected AttackingCoreTask(Client client, RaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getNormalGear() {
        return config.normalCore();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getSpecialGear() {
        return config.specialCore();
    }

    @Override
    public void reset() {
        this.lastWeaponEquipTick = 0;
        this.hasEquippedWeapon = false;
        this.coreProjectileCount = 0;
    }

    @Override
    public boolean shouldExecute() {
        NPC warden = getWardenNPC();
        if (warden == null) {
            return false;
        }

        // Reset weapon equip state when warden animates
        if (warden.getAnimation() != WARDEN_ANIMATION_1 &&
            warden.getAnimation() == WARDEN_ANIMATION_2) {
            this.lastWeaponEquipTick = -1;
            return false;
        }

        // Equip weapon when safe (based on projectile timing)
        Item weapon = Inventory.getFirst(KERIS_ID, SHADOW_ID);
        boolean weaponEquipped = Equipment.contains(KERIS_ID, SHADOW_ID);

        int ticksSinceEquip = client.getTickCount() - this.lastWeaponEquipTick;
        int ticksUntilSafe = BASE_TICKS_SAFE + (this.coreProjectileCount - 1) * TICKS_PER_PROJECTILE;

        if ((weapon != null || weaponEquipped) && ticksSinceEquip > ticksUntilSafe) {
            if (!weaponEquipped) {
                weapon.interact("Wield");
            }
        } else {
            // Enable prayers during wait time
            boolean useOverload = config.overlyDraining();
            enablePrayers(useOverload);
        }

        // Drink nectar if prayer low and overly draining active
        if (canDrinkNectar() && getCurrentHealth() > NECTAR_PRAYER_THRESHOLD && config.overlyDraining()) {
            Item nectar = Inventory.getFirst(NECTAR_ID_1, NECTAR_ID_2);
            if (nectar != null) {
                nectar.interact("Drink");
            }
        }

        // Find and attack the Core
        NPC core = NPCs.getNearest(CORE_NPC_ID);
        if (core == null) {
            return true;
        }

        prayers.setPrayer(7); // Enable appropriate prayer
        core.interact("Attack");
        return true;
    }

    @Override
    public boolean isActive() {
        // Core is active if:
        // 1. Core NPC exists, OR
        // 2. Warden NPC has "Attack" action (P3 phase), OR
        // 3. Recently spawned (within tick threshold)

        if (NPCs.getNearest("Core") != null) {
            return true;
        }

        NPC warden = NPCs.getNearest(npc -> {
            return npc.getName().contains("Warden") &&
                   npc.hasAction("Attack");
        });

        if (warden != null) {
            return true;
        }

        // Check if within spawn window
        int ticksSinceEquip = client.getTickCount() - this.lastWeaponEquipTick;
        return ticksSinceEquip < WARDEN_SPAWN_DELAY;
    }

    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned event) {
        Projectile projectile = event.getProjectile();

        // Track core projectiles to time weapon equipping
        if (projectile.getId() == CORE_PROJECTILE_ID) {
            Log.info("Core projectile spawned");
            this.coreProjectileCount += 1;
            this.lastWeaponEquipTick = client.getTickCount();
        }
    }
}
