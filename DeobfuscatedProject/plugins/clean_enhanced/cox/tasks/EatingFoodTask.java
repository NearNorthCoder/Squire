package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/**
 * Handles food consumption during Chambers of Xeric raids.
 * Manages health by eating food when HP drops below safe thresholds.
 * Prioritizes different food types based on availability and situation.
 */
@TaskDesc(name="Eating food", priority=30000)
public class EatingFoodTask extends Task {

    private final SquireChambersPlugin plugin;
    private final CoxManager manager;

    private boolean hasEaten;
    private int eatCount;

    @Inject
    public EatingFoodTask(SquireChambersPlugin plugin) {
        this.plugin = plugin;
        this.manager = plugin.getManager();
        this.eatCount = 0;
        this.hasEaten = false;
    }

    @Override
    public boolean run() {
        int healthThreshold = calculateHealthThreshold();

        if (shouldEat() && Combat.getCurrentHealth() > healthThreshold &&
            Combat.getHealthPercent() < 95.0 &&
            manager.shouldManageHealth()) {
            eatFood();
            return true;
        }

        if (hasOverloadActive() && eatCount >= 1) {
            hasEaten = false;
        }

        if (Combat.getCurrentHealth() < healthThreshold) {
            if (!hasEaten) {
                eatCount = 0;
            }
            hasEaten = true;
        }

        if (!hasEaten) {
            return false;
        }

        if (eatCount < 1) {
            eatFood();
            eatCount++;
            return true;
        }

        drinkRestore();
        return true;
    }

    /**
     * Checks if player is in a combat situation requiring eating
     */
    private boolean shouldEat() {
        if (!plugin.isInRaid()) {
            return false;
        }

        Player player = Players.getLocal();
        if (player == null || player.getPlane() != 0) {
            return false;
        }

        TileObject crystal = TileObjects.getNearest(obj ->
            obj.getName() != null && obj.getName().contains("Crystal") &&
            obj.hasAction("Pass")
        );

        if (crystal == null) {
            return false;
        }

        return player.getWorldY() > crystal.getWorldY();
    }

    /**
     * Checks if overload potion is currently active
     */
    private boolean hasOverloadActive() {
        return Skills.getBoostedLevel(Skill.ATTACK) + 3 >= Skills.getLevel(Skill.ATTACK);
    }

    /**
     * Eats available food, prioritizing higher healing items
     */
    private boolean eatFood() {
        // Try to eat bread first
        Item bread = Inventory.getFirst(item ->
            item.getName() != null && item.getName().startsWith("Bread") &&
            item.hasAction("Eat")
        );

        if (bread != null) {
            bread.interact("Eat");
            sleep(1);
            return true;
        }

        // Try to eat potato second
        Item potato = Inventory.getFirst(item ->
            item.getName() != null && item.getName().startsWith("Potato") &&
            item.hasAction("Eat")
        );

        if (potato != null) {
            potato.interact("Eat");
            sleep(1);
            return true;
        }

        return false;
    }

    /**
     * Drinks restore potions to recover prayer or stats
     */
    private boolean drinkRestore() {
        Item restore = Inventory.getFirst(item ->
            item.getName() != null &&
            !item.getName().startsWith("Saradomin brew") &&
            !item.getName().startsWith("Revitalisation") &&
            item.hasAction("Drink")
        );

        if (restore == null) {
            return false;
        }

        restore.interact("Drink");
        sleep(1);
        return true;
    }

    /**
     * Calculate safe health threshold based on current room and situation
     */
    private int calculateHealthThreshold() {
        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom == null || !currentRoom.contains(Players.getLocal())) {
            return 50;
        }

        RoomType roomType = currentRoom.getRoomType();

        // Vasa Nistirio - need more HP when flames are out
        if (roomType == RoomType.VASA && NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Vasa")) != null) {
            return 60;
        }

        // Vespula - dangerous room, maintain high HP
        if (roomType == RoomType.VESPULA) {
            return 100;
        }

        return 50;
    }
}
