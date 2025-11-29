package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/**
 * Task for using the Keris partisan of the sun special attack.
 *
 * This task:
 * - Uses special attack against appropriate targets
 * - Checks spec energy requirements (minimum 65%)
 * - Ensures health is sufficient (>33)
 * - Avoids using on Obelisk
 * - Only uses during dehydration invocation if configured
 */
@TaskDesc(name = "Using sun keris special", priority = 1500)
public class UsingSunKerisSpecialTask extends KephriManager {
    private static final int MIN_SPEC_ENERGY = 65;
    private static final int MIN_HEALTH = 33;
    private static final int WARDEN_ID = 11750; // Phase where spec is important
    private static final int AMBROSIA_ID = 15326; // Used to restore spec energy

    private final SquireAutoTOA plugin;
    private final PrayerManager prayerManager;

    @Inject
    protected UsingSunKerisSpecialTask(Client client, SquireAutoTOA plugin, PrayerManager prayerManager) {
        super(client);
        this.plugin = plugin;
        this.prayerManager = prayerManager;
    }

    @Override
    public boolean run() {
        NPC target = plugin.getCurrentTarget();

        // Don't use special on Obelisk, or if dehydration is active
        if (target != null && target.getName().contains("Obelisk") && config.dehydration()) {
            return false;
        }

        // Only use special in combat and when we have a target
        if (isInCombat() && !isBossFight()) {
            // Check various conditions for using special

            // Already at high raid level AND low spec energy AND decent health
            if (getCurrentRaidLevel() >= 14941 &&
                Combat.getSpecEnergy() < MIN_SPEC_ENERGY &&
                Combat.getCurrentHealth() > MIN_HEALTH) {
                return false;
            }

            // At Warden phase, save spec
            if (getCurrentRaidLevel() == 15326) {
                return false;
            }

            // Not at Warden and no ambrosia to restore spec
            if (getCurrentRaidLevel() != 15326 &&
                !Inventory.contains(item -> SupplyType.AMBROSIA.matchesId(item.getId()))) {
                return false;
            }

            // Use special attack
            plugin.useSpecialAttack(14);
        }

        // Boss fight - use special attack strategically
        if (isBossFight()) {
            plugin.useSpecialAttack(15);
        }

        // Don't use if health too low
        if (Combat.getCurrentHealth() > plugin.getMinSpecHealth()) {
            plugin.disableSpecialAttack();
            return false;
        }

        return enableSpecialAttack();
    }
}
