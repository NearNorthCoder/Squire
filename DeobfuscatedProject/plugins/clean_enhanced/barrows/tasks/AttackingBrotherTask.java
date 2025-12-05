/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * This task handles attacking Barrows brothers during runs.
 * It manages gear swapping, special attacks, and auto-casting for optimal DPS.
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum2;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

/**
 * Task for attacking Barrows brothers.
 * Handles gear switching between combat styles, special attacks, and magic auto-casting.
 */
@TaskDesc(name="Attacking brother", priority=13337, blocking=true)
public class AttackingBrotherTask extends Task {

    private static final int ENUM_COMBAT_STYLES = 1153; // Enum ID for combat styles
    private static final int MAX_SPEC_WEAPON_DAMAGE = 6277; // Max damage value

    // Item IDs for Iban Staff variants
    private static final int IBAN_STAFF = 1409;
    private static final int IBAN_STAFF_U = 12658;
    private static final int UPGRADED_IBAN_STAFF = 25627;

    // Widget IDs for auto-casting
    private static final int COMBAT_TAB_WIDGET = 593942;
    private static final int IBAN_BLAST_WIDGET = 14286885;

    private final SquireBarrows plugin;
    private final SquireBarrowsConfig config;
    private final BarrowsManager manager;

    @Inject
    public AttackingBrotherTask(SquireBarrows plugin, SquireBarrowsConfig config, BarrowsManager manager) {
        this.plugin = plugin;
        this.config = config;
        this.manager = manager;
    }

    @Override
    public boolean run() {
        GameEnum2 currentBrother = plugin.getCurrentBrother();
        if (currentBrother == null) {
            return false;
        }

        // Don't attack if in banking state or in house
        if (!plugin.isBanking() || plugin.isInHouse()) {
            return false;
        }

        NPC brother = NPCs.getNearest(npc -> isBrotherNpc(currentBrother, npc));

        if (brother == null) {
            return false;
        }

        // Handle Iban Blast auto-casting
        SpellBook.Standard ibanBlast = SpellBook.Standard.IBAN_BLAST;
        int[] ibanStaffIds = new int[]{IBAN_STAFF, IBAN_STAFF_U, UPGRADED_IBAN_STAFF};

        if (Equipment.contains(ibanStaffIds) && Magic.canCast(ibanBlast) && !Magic.isAutoCasting()) {
            Log.info("Auto casting IBAN BLAST");

            // Widget IDs for combat tab autocast setup
            Widget combatTab = Static.getClient().getWidget(COMBAT_TAB_WIDGET);
            if (combatTab != null) {
                combatTab.interact(1, 57, 0, COMBAT_TAB_WIDGET);
            }

            Widget ibanSpell = Static.getClient().getWidget(IBAN_BLAST_WIDGET);
            if (ibanSpell != null) {
                ibanSpell.interact(1, 57, 35, IBAN_BLAST_WIDGET);
            }

            return true;
        }

        // Determine if we should use special attack
        boolean hasSpecEnergy = Combat.getSpecEnergy() >= getRequiredSpecEnergy(currentBrother);

        // Determine if we should use special attack gear
        boolean shouldSpec = shouldSpecOnBrother(currentBrother) && hasSpecEnergy;

        if (shouldSpec) {
            // Swap to spec gear if not already equipped
            if (!Gear.isEquipped(manager.getSpecGear(currentBrother))) {
                Log.info("Swapping to spec gear");
                Gear.swapTo(manager.getSpecGear(currentBrother));
                return true;
            }

            // Enable special attack if not already enabled
            if (!Combat.isSpecEnabled()) {
                Log.info("Toggling spec");
                Combat.toggleSpec();
                return true;
            }
        }

        // Swap back to normal gear if not speccing
        if (!shouldSpec && !Gear.isEquipped(manager.getNormalGear(currentBrother))) {
            Gear.swapTo(manager.getNormalGear(currentBrother));
        }

        // Attack the brother if not already interacting
        if (Players.getLocal().getInteracting() != brother) {
            brother.interact("Attack");
            plugin.setCurrentBrotherNpc(brother);
            return true;
        }

        return true;
    }

    /**
     * Checks if an NPC is a Barrows brother matching the current target
     */
    private static boolean isBrotherNpc(GameEnum2 brother, NPC npc) {
        return !npc.isDead() &&
               npc.getName().contains(brother.getName()) &&
               npc.getInteracting() == Players.getLocal();
    }

    /**
     * Checks if we should use special attack on the given brother
     */
    private boolean shouldSpecOnBrother(GameEnum2 brother) {
        if (brother == GameEnum2.AHRIM && config.specOnAhrim()) {
            return true;
        }
        if (brother == GameEnum2.KARIL && config.specOnKaril()) {
            return true;
        }
        return false;
    }

    /**
     * Gets the required special attack energy for the given brother's spec weapon
     */
    private int getRequiredSpecEnergy(GameEnum2 brother) {
        if (brother != GameEnum2.AHRIM && brother != GameEnum2.KARIL) {
            return MAX_SPEC_WEAPON_DAMAGE;
        }

        EquipmentSetup karilSpecGear = config.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup ahrimSpecGear = config.ahrimSpecGear().selected(EquipmentSetup.class);

        int ahrimWeaponId = -1;
        int karilWeaponId = -1;

        if (ahrimSpecGear != null) {
            ahrimWeaponId = ahrimSpecGear.get(EquipmentInventorySlot.WEAPON);
        }

        if (karilSpecGear != null) {
            karilWeaponId = karilSpecGear.get(EquipmentInventorySlot.WEAPON);
        }

        int weaponId = (brother == GameEnum2.AHRIM) ? ahrimWeaponId : karilWeaponId;
        return getWeaponSpecEnergy(weaponId);
    }

    /**
     * Gets the special attack energy required for a weapon
     */
    public static int getWeaponSpecEnergy(int weaponId) {
        if (weaponId == -1) {
            return MAX_SPEC_WEAPON_DAMAGE;
        }

        // Get weapon spec energy from game enum
        int specPercent = Static.getClient().getEnum(ENUM_COMBAT_STYLES).getIntValue(weaponId);
        return specPercent / 10;
    }
}
