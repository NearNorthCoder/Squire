/*
 * Decompiled with CFR 0.152.
 *
 * Stamina Potion Drinking Task
 *
 * This task handles drinking stamina potions during TOA raids.
 * It drinks stamina potions when:
 * - Run energy is below threshold (5)
 * - Stamina effect is not already active
 * - Stamina cooldown varbit is not active
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking stamina", priority=100)
public class DrinkingStaminaTask extends KephriManager {

    // Constants
    private static final int STAMINA_COOLDOWN_VARBIT = 31708; // 0x7BDC
    private static final int RUN_ENERGY_THRESHOLD = 5;

    @Inject
    protected DrinkingStaminaTask(Client client) {
        super(client);
    }

    @Override
    public boolean run() {
        // Don't drink if stamina effect is already active
        if (Movement.isStaminaBoosted()) {
            return false;
        }

        // Don't drink if stamina cooldown is active (varbit > 0)
        if (Vars.getBit(STAMINA_COOLDOWN_VARBIT) > 0) {
            return false;
        }

        // Find stamina potion in inventory
        Item staminaPotion = Inventory.getFirst(item ->
            item.getName().startsWith("Stamina")
        );

        // No stamina potion found
        if (staminaPotion == null) {
            return false;
        }

        // Only drink if run energy is above threshold
        // (prevents wasting stamina when energy is too low)
        if (Movement.getRunEnergy() > RUN_ENERGY_THRESHOLD) {
            return false;
        }

        // Drink the stamina potion
        staminaPotion.interact("Drink");
        return true;
    }
}
