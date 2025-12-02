/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.client.plugins.fw.common;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking stamina potion")
public class DrinkStamina
extends Task {
    @Override
    public boolean run() {
        Item stamina = Inventory.getFirst(i -> i.getName().contains("Stamina"));
        if (stamina == null) {
            return false;
        }
        if (Movement.getRunEnergy() < 50 && !Movement.isStaminaBoosted()) {
            stamina.interact("Drink");
            return true;
        }
        return false;
    }
}
