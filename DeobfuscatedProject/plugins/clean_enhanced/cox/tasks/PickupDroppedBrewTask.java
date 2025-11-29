package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/**
 * Automatically picks up Saradomin brews that are dropped on the ground.
 * Brews are valuable healing items in CoX and should be retrieved if safe to do so.
 * Avoids picking up brews during dangerous situations or when inventory management is needed.
 */
@TaskDesc(name="Pickup Dropped Brew", priority=30000, blocking=true)
public class PickupDroppedBrewTask extends Task {

    private static final int SARADOMIN_BREW_ID = 6685;

    private final SquireChambersPlugin plugin;
    private final SquireChambersConfig config;

    @Inject
    public PickupDroppedBrewTask(SquireChambersPlugin plugin, SquireChambersConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        if (!config.pickupBrews()) {
            return false;
        }

        if (!plugin.shouldManagePrayer()) {
            return false;
        }

        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom == null) {
            return false;
        }

        // Don't pick up brews during Scavengers room
        if (currentRoom.getRoomType() == RoomType.SCAVENGERS) {
            return false;
        }

        // Don't pick up brews during Tightrope if we don't have rope yet
        if (currentRoom.getRoomType() == RoomType.TIGHTROPE &&
            !Inventory.contains("Rope")) {
            return false;
        }

        // Don't pick up if actively in combat with NPCs
        NPC combatNPC = NPCs.getNearest(npc ->
            npc.hasAction("Attack") &&
            plugin.getCurrentRoom().contains(npc)
        );

        if (combatNPC != null) {
            return false;
        }

        // Don't pick up if inventory is full (need space management)
        if (Inventory.isFull()) {
            return false;
        }

        // Check if we need more brew capacity based on room
        if (currentRoom.getRoomType() == RoomType.ICE_DEMON) {
            int neededKindling = 20 - plugin.getTeamSize() +
                                (30 - Skills.getLevel(Skill.WOODCUTTING)) / 10;
            if (neededKindling > 0) {
                return false;
            }
        }

        if (currentRoom.getRoomType() == RoomType.THIEVING) {
            int neededLockpicks = 50 - plugin.getPartyIndex() +
                                  (30 - Skills.getLevel(Skill.THIEVING)) / 10;
            if (neededLockpicks > 0) {
                return false;
            }
        }

        // Don't pick up vials
        TileItem vial = TileItems.getNearest(item ->
            item.getId() == 229 &&  // Vial ID
            Reachable.isWalkable(item.getWorldLocation())
        );

        if (vial != null) {
            return false;
        }

        // Find dropped brews
        TileItem brew = TileItems.getNearest(item ->
            item.getName() != null &&
            item.getName().toLowerCase().contains("saradomin brew") &&
            plugin.getCurrentRoom().contains(item) &&
            Reachable.isWalkable(item.getWorldLocation())
        );

        if (brew == null) {
            return false;
        }

        brew.interact("Take");
        return true;
    }
}
