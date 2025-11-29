/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.WardenPhaseManager;

@TaskDesc(name="Attacking Obelisk", priority=50)
public class AttackingObeliskTask extends AutotoaManager {

    private static final String OBELISK_NAME = "Obelisk";
    private static final String ATTACK_ACTION = "Attack";
    private static final int MIN_SPEC_ENERGY = 50;
    private static final int KERIS_ITEM_ID = 27227; // Keris partisan of breaching

    private final WardenPhaseManager wardenPhaseManager;

    @Inject
    protected AttackingObeliskTask(Client client, WardenPhaseManager wardenManager, TOAConfig config) {
        super(client, wardenManager, config);
        this.wardenPhaseManager = wardenManager;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getDefaultGear() {
        return null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getSpecialGear() {
        return this.config.obeliskGear();
    }

    /**
     * Checks if we should use special attack on the obelisk
     * Special attack should be used when we have enough energy and Keris equipped
     */
    @Override
    public boolean shouldUseSpecialAttack() {
        // Check if we have enough special attack energy and Keris equipped
        if (Combat.getSpecEnergy() >= MIN_SPEC_ENERGY
            && Equipment.contains(KERIS_ITEM_ID)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean execute() {
        NPC obelisk = NPCs.getNearest(OBELISK_NAME);

        if (obelisk == null) {
            return false;
        }

        // Don't attack if currently in combat animation
        if (this.wardenPhaseManager.isInCombatAnimation()) {
            return false;
        }

        // Attempt special attack if conditions are met
        this.attemptSpecialAttack(obelisk, true);

        // Check if we're in melee distance and there's a core object nearby
        if (this.getCurrentTarget() == obelisk
            && obelisk.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation())
            && TileObjects.getNearest(tileObject ->
                WardenPhaseManager.CORE_OBJECT_IDS.contains(tileObject.getId())) != null) {
            return false;
        }

        // Attack the obelisk
        obelisk.interact(ATTACK_ACTION);
        return true;
    }
}
