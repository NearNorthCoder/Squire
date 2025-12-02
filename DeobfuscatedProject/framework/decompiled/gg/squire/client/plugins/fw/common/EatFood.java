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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food")
public class EatFood
extends Task {
    private static int eatAt = 50;

    @Override
    public boolean run() {
        if (Combat.getCurrentHealth() > eatAt) {
            return false;
        }
        Item food = Inventory.getFirst(i -> i.hasAction("Eat"::equals));
        if (food == null) {
            return false;
        }
        food.interact("Eat");
        return true;
    }

    public static int getEatAt() {
        return eatAt;
    }

    public static void setEatAt(int eatAt) {
        EatFood.eatAt = eatAt;
    }
}
