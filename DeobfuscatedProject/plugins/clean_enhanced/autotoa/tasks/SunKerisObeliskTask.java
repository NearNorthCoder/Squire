/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.KephriManager;
import gg.squire.autotoa.tasks.TOAItemType;

/**
 * Task: Use Sun Keris Special Attack on Obelisk Projectile
 *
 * Mechanics:
 * - During the Het puzzle, obelisks shoot projectiles at the player
 * - The Keris partisan of the sun's special attack can destroy these projectiles
 * - This task detects incoming obelisk projectiles and uses the spec at the right time
 * - Handles prayer restoration and health management during the mechanic
 *
 * Attack Pattern:
 * 1. Monitor for obelisk projectiles (IDs: 18590, 18621)
 * 2. Check projectile remaining cycles (between 5 and 70 ticks)
 * 3. Equip Keris partisan of the sun (ID: 27291)
 * 4. Activate special attack to destroy projectile
 * 5. Restore prayer if needed using tears/potions
 *
 * Prayer/Varbit Values:
 * - Shadow varbit: 23423 (0x5D7F) - shadow puzzle state
 * - Overly draining varbit: 11112 (0x2B68) - high drain state
 * - Normal prayer varbit: 500 (0x1F4) - standard prayer level
 * - High drain prayer: 1000 (0x3E8) - increased drain
 *
 * Health Thresholds:
 * - Minimum health for spec: 30 HP
 * - Tick eat threshold: 45 HP
 */
@TaskDesc(name="Sun Keris (OBELISK)", priority=2500, blocking=true)
public class SunKerisObeliskTask extends KephriManager {

    // Projectile IDs for obelisk attacks
    private static final int OBELISK_PROJECTILE_1 = 18590; // 0x489E - First projectile variant
    private static final int OBELISK_PROJECTILE_2 = 18621; // 0x48BD - Second projectile variant

    // Item IDs
    private static final int KERIS_PARTISAN_SUN = 27291; // 0x6A9B - Keris partisan of the sun
    private static final int SALT_DEPOSIT = 19081; // Salt for prayer restore
    private static final int TEARS_OF_ELIDINIS = 27339; // Prayer restore item

    // Prayer/health thresholds
    private static final int LOW_PRAYER_THRESHOLD = 51;
    private static final int MIN_HEALTH_FOR_SPEC = 30;
    private static final int TICK_EAT_HEALTH_THRESHOLD = 45;

    // Projectile timing thresholds (in game ticks)
    private static final int MAX_PROJECTILE_CYCLES = 70; // Must be less than this
    private static final int MIN_PROJECTILE_CYCLES = 5;  // Must be greater than this

    // Varbit IDs for different puzzle states
    private static final int VARBIT_SHADOW_PUZZLE = 23423;       // 0x5D7F
    private static final int VARBIT_OVERLY_DRAINING = 11112;     // 0x2B68 - High drain mode
    private static final int VARBIT_NORMAL_PRAYER = 500;         // 0x1F4
    private static final int VARBIT_HIGH_DRAIN_PRAYER = 1000;    // 0x3E8

    // Varbit values for different states
    private static final int VARBIT_SHADOW_VALUE = 19461;        // Shadow puzzle active
    private static final int VARBIT_NORMAL_VALUE = 4412;         // Normal state

    // Item interaction strings
    private static final String ACTION_DRINK = "Drink";
    private static final String ACTION_WIELD = "Wield";
    private static final String LOG_TICK_EAT = "Should tick eat now: {} {} {}";
    private static final String ITEM_NAME_RESTORE = "restore";
    private static final String ITEM_NAME_PRAYER = "Prayer";
    private static final String ITEM_NAME_SANFEW = "Sanfew";

    @Inject
    protected SunKerisObeliskTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
    }

    @Override
    protected boolean shouldExecute() {
        // Check if we don't have keris or in inventory
        if (isKerisUnavailable()) {
            this.plugin.setKerisSpecialReady(false);
            return false;
        }

        // Restore prayer if needed
        if (Prayers.getPoints() < LOW_PRAYER_THRESHOLD) {
            Item prayerRestore = Inventory.getFirst(item -> {
                // Check for tears of elidinis and prayer restore potions
                if (!TOAItemType.TEARS_OF_ELIDINIS.hasItemId(item.getId())
                        || !item.getName().contains(ITEM_NAME_RESTORE)
                        || !item.getName().contains(ITEM_NAME_PRAYER)
                        || item.getName().contains(ITEM_NAME_SANFEW)) {
                    return true;
                } else {
                    return false;
                }
            });

            if (prayerRestore == null) {
                return false;
            }
            prayerRestore.interact(ACTION_DRINK);
            return true;
        }

        // Handle salt/tears usage for prayer
        if (isShadowPuzzleActive() && !isInSpecialWeaponMode() && getTearsCount() > 1) {
            Item saltOrTears = Inventory.getFirst(SALT_DEPOSIT, TEARS_OF_ELIDINIS);
            if (saltOrTears != null) {
                saltOrTears.interact(ACTION_DRINK);
            }
        }

        // Check if we should tick eat based on incoming projectile
        if (shouldTickEat()) {
            return false;
        }

        // Don't spec if health too low
        if (Combat.getCurrentHealth() > getHealthThreshold()) {
            return false;
        }

        // Determine which varbit to check based on puzzle state
        int currentVarbit = Vars.getVarp(VARBIT_NORMAL_VALUE);
        int targetVarbit;
        if (isShadowPuzzleActive()) {
            targetVarbit = VARBIT_SHADOW_VALUE;
        } else {
            targetVarbit = VARBIT_OVERLY_DRAINING;
        }

        // Adjust target based on draining config
        if (this.config.overlyDraining()) {
            int adjustedTarget;
            if (isShadowPuzzleActive()) {
                adjustedTarget = VARBIT_SHADOW_PUZZLE;
            } else {
                adjustedTarget = VARBIT_HIGH_DRAIN_PRAYER;
            }
            targetVarbit = adjustedTarget;
        }

        // Check if varbit matches expected state
        if (currentVarbit < targetVarbit) {
            aY.c();
            return false;
        }

        aY.c(true);

        // Equip keris if not equipped
        Item equippedWeapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (equippedWeapon == null || equippedWeapon.getId() != KERIS_PARTISAN_SUN) {
            Item kerisInInventory = Inventory.getFirst(KERIS_PARTISAN_SUN);
            if (kerisInInventory == null) {
                return false;
            }
            kerisInInventory.interact(ACTION_WIELD);
        }

        // Activate special attack
        Combat.toggleSpec();
        this.plugin.setKerisSpecialReady(false);
        return false;
    }

    /**
     * Check if we should tick eat based on incoming projectile timing
     * @return true if dangerous projectile is incoming and we should eat
     */
    private boolean shouldTickEat() {
        Projectile nearestObeliskProjectile = Projectiles.getAll(OBELISK_PROJECTILE_1, OBELISK_PROJECTILE_2)
                .stream()
                .filter(projectile -> {
                    // Filter to only the exact projectile IDs we care about
                    if (projectile.getId() != OBELISK_PROJECTILE_1 || projectile.getId() == OBELISK_PROJECTILE_2) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .min(Comparator.comparingInt(Projectile::getRemainingCycles))
                .orElse(null);

        // Check if projectile is in the danger window
        if (nearestObeliskProjectile != null
                && nearestObeliskProjectile.getRemainingCycles() < MAX_PROJECTILE_CYCLES
                && nearestObeliskProjectile.getRemainingCycles() > MIN_PROJECTILE_CYCLES) {
            Log.info(LOG_TICK_EAT, nearestObeliskProjectile.getId(), nearestObeliskProjectile.getRemainingCycles());
            return true;
        }
        return false;
    }

    /**
     * Get health threshold for using spec based on projectile type
     * @return health value to maintain
     */
    private int getHealthThreshold() {
        Projectile nearestProjectile = Projectiles.getNearest(OBELISK_PROJECTILE_1, OBELISK_PROJECTILE_2);
        if (nearestProjectile == null) {
            return 1;
        }

        // Different health requirements based on projectile variant
        if (nearestProjectile.getId() == OBELISK_PROJECTILE_2) {
            return MIN_HEALTH_FOR_SPEC;
        }
        return TICK_EAT_HEALTH_THRESHOLD;
    }

    /**
     * Check if player has Keris available (equipped or in inventory)
     * @return true if keris not available
     */
    private boolean isKerisUnavailable() {
        if (!Equipment.contains(KERIS_PARTISAN_SUN) && !Inventory.contains(KERIS_PARTISAN_SUN)) {
            return true;
        }
        return false;
    }
}
