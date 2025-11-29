package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Manages stamina potion usage in Chambers of Xeric.
 * Stamina potions are raid-specific potions that restore run energy
 * and provide temporary immunity to energy drain while running.
 * These are crucial for efficient raid navigation.
 */
@TaskDesc(name="Drink Stamina", priority=30000)
public class DrinkStaminaTask extends Task {

    private final SquireChambersPlugin plugin;

    @Inject
    public DrinkStaminaTask(SquireChambersPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        if (isNearPrivateStorage()) {
            return false;
        }

        // Drink stamina when run energy is low and stamina buff is not active,
        // or when energy is critically low regardless of buff
        if ((Movement.getRunEnergy() < 10 && !Movement.isStaminaBoosted()) ||
            Movement.getRunEnergy() < 20) {
            drinkStamina();
            return true;
        }

        return false;
    }

    /**
     * Consumes a stamina potion from inventory
     */
    private boolean drinkStamina() {
        Item stamina = Inventory.getFirst(item ->
            item.getName() != null &&
            item.getName().startsWith("Stamina") &&
            item.hasAction("Drink")
        );

        if (stamina == null) {
            return false;
        }

        stamina.interact("Drink");
        sleep(4);
        return true;
    }

    /**
     * Checks if player is near private storage chest.
     * Don't drink stamina near storage as we may be reorganizing inventory.
     */
    private boolean isNearPrivateStorage() {
        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom == null || !currentRoom.contains(Players.getLocal())) {
            return false;
        }

        TileObject storage = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Private storage") &&
            obj.hasAction("Use") &&
            currentRoom.contains(obj)
        );

        return storage != null;
    }
}
